## Text Adventure Game

### Project Description
The assigned project for the WIX1002 - Fundamentals of Programming (FOP) course involves developing an RPG-based text adventure game. The game can be implemented using either a Command Line Interface (CLI) or a Graphical User Interface (GUI). This project requires a blend of technical skills and creativity, demanding both programming knowledge and imaginative design. The game involves navigating a virtual environment, interacting with various elements, and progressing through different challenges. To successfully complete this project, we must demonstrate proficiency in Object-Oriented Programming, using Java as the primary language.

### Objective
This assignment not only tests our technical skills in Java programming and database management but also encourages creative problem-solving and design. We are expected to go beyond the basic requirements, showcasing our individuality and innovation in game design.

### Key Requirements
1. **Map Design**: Creating a 40x40 map with navigable spaces and obstacles.
2. **Archetypes**: Developing five unique archetypes, each with specific attributes loaded from a file.
3. **Levelling-Up System**: Implementing a levelling-up system to enhance player progression.
4. **Monsters**: Developing a monster class, along with specific monster types, to challenge players.
5. **Spells**: Crafting spells for each archetype, adding strategic depth to gameplay.
6. **Battle System**: Establishing a round-based battle system for player-monster interactions.
7. **Save Game Feature**: Incorporating a save game feature for preserving game progress.
8. **Input Handling**: Handling abnormal inputs gracefully to ensure a robust user experience.
9. **Visual Appeal**: Enhancing the game's visual appeal with colourful text and ASCII art.
10. **Database Management**: Utilizing a database for data management and retrieval.
11. **Version Control**: Applying Git and GitHub for version control and collaboration.

### Description for The Solution
**Map Design:** We designed a 40x40 map with '#' characters as obstacles, restricting player movement. Players navigate the map using the W, A, S, and D keys (W=up, S=down, A=left, D=right).

**Archetype Creation:** We defined five archetypes (referred to as "majors") with initial attributes such as health points, attack, and defense. We stored archetype data in a file to enable easy modification without altering the code.

**Levelling-Up System:** Instead of traditional levels, characters gain "credits" to progress. This approach maintains the concept of progression while aligning with the game's theme.

**Monster Class Development:** We created a base monster class with properties like health points, attack, and defense. Specific monster types were derived from this base, each with unique characteristics. Monster locations are randomly generated on the map.

**Spell Crafting:** Three distinct spells were created for each archetype, unlocking at specific character levels with individual cooldown periods. Spell descriptions, level requirements, and cooldown times were documented in a file.

**Battle System:** Players engage in round-based battles with various moves such as attacking, defending, healing, or escaping. Spells can also be used. Battles continue until a win, loss, or player exit, with descriptive feedback provided.

**Save Game Feature:** A save game feature allows players to record their progress and resume later. Automatic saving functionality was implemented using a database and File I/O.

**Input Handling:** The program effectively handles unexpected or incorrect inputs, ensuring a smooth user experience. Valid choices are highlighted using colorful text in the User Interface.

**Visual Enhancements:** ASCII art and colored text were used to enhance the game's visual appeal. Color-coding for specific keywords and incorporating dynamic visual cues improved clarity and player engagement.

Throughout development, we applied Object-Oriented principles to maintain a robust and maintainable codebase.

### How to Run
1. Clone the repository.
2. Navigate to the project directory.
3. Compile the Java files.
4. Run the main class to start the game.

### Contributing
1. Fork the repository.
2. Create your feature branch (`git checkout -b feature/AmazingFeature`).
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`).
4. Push to the branch (`git push origin feature/AmazingFeature`).
5. Open a pull request.
