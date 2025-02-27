# Matrix-Multiplication
# Anay, Chittresh, Rutvik, Aniketh

<img width="428" alt="Screenshot 2025-02-27 at 1 48 51 PM" src="https://github.com/user-attachments/assets/3a106995-05d5-4306-8d44-01ae72a61c69" />

- Checks if multiplication is possible by verifying that the number of columns in the first matrix matches the number of rows in the second. If not, returns null.
- Initializes a result matrix with dimensions [rows of first matrix] x [columns of second matrix], setting all values to 0.
- Uses three nested loops to compute the matrix multiplication:
  - Outer loop iterates through the rows of the first matrix.
  - Middle loop iterates through the columns of the second matrix.
  - Inner loop performs the dot product, multiplying corresponding elements and summing them to calculate each element of the result matrix.
- Returns the result matrix, which contains the computed product of the two input matrices.



<img width="474" alt="Screenshot 2025-02-27 at 1 50 20 PM" src="https://github.com/user-attachments/assets/326366f4-f093-43f0-a28f-cbba0003da00" />

- Checks if m3 is null, meaning matrix multiplication was not possible due to incompatible sizes, and prints an error message.
- Iterates through the result matrix (m3) using an enhanced for-loop to process each row.
- Iterates through each element (val) in the row and prints it in a formatted way using String.format("%5.1f ", val), ensuring numbers are right-aligned with one decimal place.
- Adds a newline (System.out.println()) after each row to properly format the matrix output.
