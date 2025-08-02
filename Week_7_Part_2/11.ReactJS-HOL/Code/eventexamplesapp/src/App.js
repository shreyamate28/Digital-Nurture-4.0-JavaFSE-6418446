import React, { Component } from 'react';
import CurrencyConvertor from './CurrencyConvertor';

class App extends Component {
  constructor(props) {
    super(props);
    this.state = {
      counter: 5   // start from 5 as in image
    };
    this.increment = this.increment.bind(this);
    this.decrement = this.decrement.bind(this);
    this.sayWelcome = this.sayWelcome.bind(this);
    this.handleClick = this.handleClick.bind(this);
  }

  increment() {
    this.setState({ counter: this.state.counter + 1 });
    this.sayHello();
  }

  decrement() {
    this.setState({ counter: this.state.counter - 1 });
  }

  sayHello() {
    alert("Hello! Member1");
  }

  sayWelcome() {
    alert("welcome");
  }

  handleClick(e) {
    alert("I was clicked");
  }

  render() {
    return (
      <div style={{ padding: '20px' }}>
        <h2>{this.state.counter}</h2>
        <button onClick={this.increment}>Increment</button><br/><br/>
        <button onClick={this.decrement}>Decrement</button><br/><br/>
        <button onClick={this.sayWelcome}>Say welcome</button><br/><br/>
        <button onClick={this.handleClick}>Click on me</button><br/><br/>

        <CurrencyConvertor />
      </div>
    );
  }
}

export default App;
