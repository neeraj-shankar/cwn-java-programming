Modular arithmetic is a system of arithmetic for integers, where numbers "wrap around" upon reaching a certain value, known as the modulus. It's a fundamental concept in number theory and has practical applications in computer science, cryptography, and coding theory.

### Key Concepts of Modular Arithmetic:

1. **Modulus**: 
   - The modulus is a positive integer \( n \) that defines the range of possible values. Once numbers reach \( n \), they wrap around to 0.

2. **Congruence**:
   - Two integers \( a \) and \( b \) are said to be congruent modulo \( n \) if they have the same remainder when divided by \( n \). This is written as:
     \[
     a \equiv b \pmod{n}
     \]
   - For example, \( 17 \equiv 5 \pmod{12} \) because both 17 and 5 have a remainder of 5 when divided by 12.

3. **Basic Operations**:
   - **Addition**: 
     \[
     (a + b) \mod n = [(a \mod n) + (b \mod n)] \mod n
     \]
   - **Subtraction**: 
     \[
     (a - b) \mod n = [(a \mod n) - (b \mod n)] \mod n
     \]
   - **Multiplication**: 
     \[
     (a \times b) \mod n = [(a \mod n) \times (b \mod n)] \mod n
     \]
   - **Exponentiation**:
     \[
     (a^b) \mod n
     \]
     This can be efficiently computed using techniques like exponentiation by squaring.

### Example:
Suppose you want to compute \( (7 + 5) \mod 3 \).

1. Compute the sum: \( 7 + 5 = 12 \).
2. Find the remainder of 12 when divided by 3: \( 12 \div 3 = 4 \) with a remainder of 0.
3. Therefore, \( (7 + 5) \mod 3 = 0 \).

### Applications:
- **Cryptography**: Used in algorithms like RSA for securing data.
- **Computer Science**: Helps in hashing functions and creating cyclic structures like circular buffers.
- **Calendars**: Days of the week cycle every 7 days, which is a form of modular arithmetic.

Modular arithmetic simplifies calculations by focusing on remainders, making it powerful for problems involving periodicity and cycles.