Dice Roller App - README

Overview

The Dice Roller App is an Android application designed to replace physical dice with a convenient, fair, and tamper-proof digital solution. This app eliminates common issues associated with traditional dice, such as misplacement, irregularities, and cheating. With an intuitive interface and reliable randomization algorithms, the Dice Roller App ensures a seamless and fair gaming experience for all users.

Features

User-Friendly Interface: Simple and clean design for easy navigation and use.

Random Number Generation: Utilizes a robust algorithm to ensure true randomness, eliminating biases.

Customizable Dice: Supports multiple types of dice (D4, D6, D8, D10, D12, D20) for various gaming needs.

Roll History: Keeps a record of previous rolls for transparency and reference.

Shake to Roll: Allows users to shake their device to roll the dice, mimicking the physical dice-rolling experience.

No Physical Constraints: Ensures dice are never lost or damaged, and removes any chance of physical manipulation.


Installation

Clone the Repository:
Copy code
git clone https://github.com/Sidharth-1996/Dice_Roller_App.git

Open in Android Studio:
Launch Android Studio.
Select "Open an existing Android Studio project".
Navigate to the cloned repository and open it.

Build the Project:
Allow Android Studio to download all necessary dependencies.
Click on "Build" in the top menu and select "Rebuild Project".

Run the Application:
Connect your Android device via USB or set up an emulator.
Click the "Run" button (green triangle) in the toolbar or press Shift+F10.


Usage

Launching the App: Open the Dice Roller App from your device's application menu.
Selecting Dice Type: Choose the type of dice you wish to roll from the main screen.
Rolling the Dice: Tap the "Roll" button or shake your device to roll the selected dice.
Viewing Roll History: Access the history of previous rolls by tapping the "History" button.


Development

Prerequisites
Android Studio (latest version recommended)
Basic knowledge of Kotlin and Android development

Code Structure
MainActivity.kt: Handles the main user interface and dice-rolling logic.
Dice.kt: Contains the dice data model and randomization logic.
HistoryActivity.kt: Manages the display of roll history.
res/: Contains all the app's resources, including layouts, strings, and drawable assets.

Customization
To customize the dice or add new features, follow these steps:

Modify Dice Types:
Update the Dice.kt file to add or remove dice types.
Adjust the user interface in activity_main.xml to reflect changes.

Change App Theme:
Modify the styles in res/values/styles.xml.
Update colors in res/values/colors.xml.

Enhance Functionality:
Add new activities or fragments as needed.
Implement additional features like saving roll history to a database or integrating with cloud storage.

Contributing
We welcome contributions to enhance the Dice Roller App. Please follow these steps to contribute:

Fork the Repository: Click the "Fork" button at the top of the repository page.
Create a Branch: Use the git checkout -b feature/your-feature-name command.
Commit Your Changes: Use descriptive commit messages for clarity.
Push to the Branch: Use git push origin feature/your-feature-name.
Open a Pull Request: Navigate to the original repository and open a pull request.

Contact
For any questions, suggestions, or issues, please contact sharmasidharth784@gmail.com.
