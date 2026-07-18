import React, { Component } from "react";

class EventExamples extends Component {
  constructor() {
    super();

    this.state = {
      count: 0,
      message: "",
    };

    // Binding
    this.increment = this.increment.bind(this);
    this.decrement = this.decrement.bind(this);
    this.sayWelcome = this.sayWelcome.bind(this);
    this.handlePress = this.handlePress.bind(this);
  }

  // 🔹 Increment logic
  increment() {
    this.setState({
      count: this.state.count + 1,
    });
  }

  // 🔹 Multiple methods call
  incrementMultiple() {
    this.increment();
    this.sayHello();
  }

  // 🔹 Static message
  sayHello() {
    alert("Hello! Member 1");
  }

  decrement() {
    this.setState({
      count: this.state.count - 1,
    });
  }

  sayWelcome(message) {
    alert(message);
  }

  handlePress(event) {
    alert("I was clicked");
    console.log(event);
  }

  render() {
    return (
      <div>
        <h2>Counter: {this.state.count}</h2>

        {}
        <button onClick={() => this.incrementMultiple()}>Increment</button>

        <button onClick={this.decrement}>Decrement</button>

        <br />
        <br />

        {}
        <button onClick={() => this.sayWelcome("Welcome")}>Say Welcome</button>

        <br />
        <br />

        {}
        <button onClick={this.handlePress}>Click me</button>
      </div>
    );
  }
}

export default EventExamples;
