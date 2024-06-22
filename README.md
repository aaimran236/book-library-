# Book Library

Book Library is an Android application designed to help users manage their personal or public library by storing records of books, including title, author, and the number of pages. The app utilizes an SQLite database for offline data storage, ensuring users can access and manage their library records without an internet connection. The application also features a customizable theme, allowing users to switch between light, dark, and system default themes.

## Features

- **Add Books**: Users can add new book records, including the title, author, and number of pages.
- **Update Books**: Existing book records can be updated with new information.
- **Delete Books**: Users can delete book records from the library.
- **View Books**: All stored books are displayed in a RecyclerView for easy viewing.
- **Theme Selection**: Users can choose between light, dark, and system default themes for the app's interface.

## Screenshots
<img src="https://github.com/aaimran236/book-library-/assets/106193863/1e50477b-b93c-4bad-bacf-94b4b1f8cc90" width="200" height="445">
 &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
<img src="https://github.com/aaimran236/book-library-/assets/106193863/ef9464c6-78c5-4695-aeda-d2da1b376140" width="200" height="445">
&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
<img src="https://github.com/aaimran236/book-library-/assets/106193863/a0cab76c-f069-486a-859d-a4d9953ceb53" width="200" height="445">
&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
<img src="https://github.com/aaimran236/book-library-/assets/106193863/c3595447-916e-4fe9-a268-7a8aa722704e" width="200" height="445">
&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
<img src="https://github.com/aaimran236/book-library-/assets/106193863/4d1c5d25-9578-47e7-8ca8-a3014d99db1b" width="200" height="445">
&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
<img src="https://github.com/aaimran236/book-library-/assets/106193863/d2e50d82-afa3-4d71-8a8e-170127bd3378" width="200" height="445">
&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
<img src="https://github.com/aaimran236/book-library-/assets/106193863/ad64f4f8-3760-4a27-a7d6-b25b9e5ee783" width="200" height="445">
&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
<img src="https://github.com/aaimran236/book-library-/assets/106193863/b9140fd7-be77-41f2-bfb8-4504b6c82192" width="200" height="445">


## Getting Started

### Prerequisites

- Android Studio
- Android SDK
- A device or emulator running Android API level 23 or higher

### Installation

1. **Clone the repository:**

   ```sh
   git clone https://github.com/yourusername/book-library.git
   cd book-library
   ```

2. **Open the project in Android Studio:**

   - Open Android Studio.
   - Select `Open an existing Android Studio project`.
   - Navigate to the cloned repository and select the `book-library` folder.

3. **Build the project:**

   - Click on `Build` in the top menu and select `Make Project` or press `Ctrl+F9`.

4. **Run the application:**

   - Connect an Android device via USB or start an emulator.
   - Click on `Run` in the top menu and select `Run 'app'` or press `Shift+F10`.

## Usage

1. **Add a Book:**
   - Click on the `+` button to open the add book screen.
   - Enter the book title, author, and number of pages.
   - Click `ADD` to add the book to the library.

2. **Update a Book:**
   - In the main screen, click on the book you want to update.
   - Modify the book details in the update screen.
   - Click `Update` to update the book information.

3. **Delete a Book:**
   - In the main screen, click on the book you want to delete.
   - Click `Delete` to delete the book information.
     
4. **Delete All books:**
   - Tap on the "Delete" icon at top right of the menu to remove all book records.
   - Confirm the deletion in the popup dialog.

5. **Select Theme:**
   - Click on the `Theme` on menu in the top.
   - Choose your preferred theme (Light, Dark, System Default).

## Database Schema

The app uses an SQLite database with the following schema:

- **Table Name:** books
- **Columns:**
  - `id` (INTEGER, PRIMARY KEY, AUTOINCREMENT)
  - `title` (TEXT)
  - `author` (TEXT)
  - `pages` (INTEGER)

## Contributing

Contributions are welcome! If you have any improvements or new features to add, please follow these steps:

1. Fork the repository.
2. Create a new branch (`git checkout -b feature/YourFeature`).
3. Commit your changes (`git commit -m 'Add some feature'`).
4. Push to the branch (`git push origin feature/YourFeature`).
5. Open a pull request.

## License

This project is licensed under the MIT License - see the https://en.wikipedia.org/wiki/MIT_License#:~:text=The%20MIT%20License%20is%20a,therefore%20has%20high%20license%20compatibility. for details.


## Acknowledgements

- Thanks to the open-source community for providing valuable resources and tools.
- Inspired by various book management applications.

---
