import { render, screen } from '@testing-library/react';
import App from './App';

test('renders learn react link', () => {
  render(<App />);
  console.log(2)
  const linkElement = screen.getByText(/learn react/i);
  console.log(1)
  expect(linkElement).toBeInTheDocument();
  console.log(1)
  
});
