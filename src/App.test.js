import { render, screen } from '@testing-library/react';
import App from './App';

test('renders learn react link', () => {
  render(<App />);
  console.log("here here")
  const linkElement = screen.getByText(/learn react/i);
  console.log("here here")
  expect(linkElement).toBeInTheDocument();
});
