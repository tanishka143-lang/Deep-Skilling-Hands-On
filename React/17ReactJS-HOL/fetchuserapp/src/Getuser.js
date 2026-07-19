import React, { Component } from "react";

class Getuser extends Component {
  constructor() {
    super();
    this.state = {
      user: null,
    };
  }

  componentDidMount() {
    fetch("https://api.randomuser.me/")
      .then((res) => res.json())
      .then((data) => {
        this.setState({
          user: data.results[0],
        });
      });
  }

  render() {
    if (!this.state.user) {
      return <h2>Loading...</h2>;
    }

    return (
      <div>
        <h1>
          {this.state.user.name.title} {this.state.user.name.first}
        </h1>

        <img src={this.state.user.picture.large} />
      </div>
    );
  }
}

export default Getuser;
