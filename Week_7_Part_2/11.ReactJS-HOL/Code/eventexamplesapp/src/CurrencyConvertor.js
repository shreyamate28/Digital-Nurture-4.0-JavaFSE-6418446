import React, { Component } from 'react';

class CurrencyConvertor extends Component {
  constructor(props) {
    super(props);
    this.state = {
      amount: '',
      currency: ''
    };
    this.handleChangeAmount = this.handleChangeAmount.bind(this);
    this.handleChangeCurrency = this.handleChangeCurrency.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);
  }

  handleChangeAmount(e) {
    this.setState({ amount: e.target.value });
  }

  handleChangeCurrency(e) {
    this.setState({ currency: e.target.value });
  }

  handleSubmit(e) {
    e.preventDefault();
    const result = this.state.amount * 80;   // example conversion rate
    alert(`Converting to  ${this.state.currency} Amount is ${result}`);
  }

  render() {
    return (
      <div>
        <h1 style={{ color: 'green' }}>Currency Convertor!!!</h1>
        <form onSubmit={this.handleSubmit}>
          <label>
            Amount:
            <input
              type="text"
              value={this.state.amount}
              onChange={this.handleChangeAmount}
            />
          </label>
          <br/><br/>
          <label>
            Currency:
            <textarea
              value={this.state.currency}
              onChange={this.handleChangeCurrency}
            />
          </label>
          <br/><br/>
          <button type="submit">Submit</button>
        </form>
      </div>
    );
  }
}

export default CurrencyConvertor;
