import React, { Component } from "react";

class CurrencyConvertor extends Component {
  constructor() {
    super();

    this.state = {
      amount: "",
      currency: "Euro",
    };

    this.handleChange = this.handleChange.bind(this);
    this.handleConvert = this.handleConvert.bind(this);
  }

  handleChange(event) {
    this.setState({
      amount: event.target.value,
    });
  }

  handleConvert(event) {
    event.preventDefault();

    const result = this.state.amount * 80;

    alert("Converting to " + this.state.currency + " Amount is " + result);
  }

  render() {
    return (
      <div>
        <h1 style={{ color: "green" }}>Currency Convertor</h1>

        <form>
          <label>Amount: </label>
          <input
            type="number"
            value={this.state.amount}
            onChange={this.handleChange}
          />

          <br />
          <br />

          <label>Currency: </label>
          <input type="text" value={this.state.currency} readOnly />

          <br />
          <br />

          <button onClick={this.handleConvert}>Submit</button>
        </form>
      </div>
    );
  }
}

export default CurrencyConvertor;
