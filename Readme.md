# Connect Four Game (JavaFX Implementation)

This project is a JavaFX GUI implementation of the classic two-player board game, Connect Four. The application follows the Model-View-Controller (MVC) architecture pattern, providing a clear separation of concerns and making the codebase easier to manage and extend.

## Table of Contents

1. [Introduction](#introduction)
2. [Goals](#goals)
3. [Project Structure](#project-structure)
    - [Model](#model)
    - [View](#view)
    - [Controller](#controller)
4. [Getting Started](#getting-started)
5. [How to Play](#how-to-play)


## Introduction

This project is part of a homework assignment to gain experience with JavaFX fundamentals and to implement a GUI version of Connect Four that adheres to the MVC architecture pattern. A plain text UI (PTUI) version of the game is provided as a reference.

## Goals

To gain experience with the following JavaFX fundamentals:
- JavaFX Hierarchy
- JavaFX UI Controls
- JavaFX Layout Components
- MVC pattern

## Project Structure

The project is structured according to the MVC architecture:

### Model

The model is responsible for managing the data and rules of the application. It receives input from the user through the controller and notifies the view when the state changes.

- **ConnectFourBoard**: This class represents the grid of discs, along with statistics and the game status.
- **Observer**: An interface implemented by the view to receive updates from the model.

### View

The view presents the model's data to the user. It registers itself as an observer of the model to receive and display updates.

- **ConnectFourPTUI**: A fully functional plain text UI.
- **ConnectFourGUI**: The JavaFX compliant GUI that you will implement.

### Controller

The controller handles user input and updates the model accordingly. In this project, the controller logic is integrated into the view components.

## Getting Started

1. Clone the repository:
    ```sh
    git clone https://github.com/KruthiNagabhushan/ConnectFour.git
    cd connect-four
    ```

2. Open the project in your preferred Java IDE (e.g., IntelliJ IDEA, Eclipse).

3. Run the `ConnectFourPTUI` class to familiarize yourself with the plain text UI version of the game.

4. Run the `ConnectFourGUI` class to create the JavaFX GUI version.

## How to Play

1. Run the `ConnectFourGUI` class.
2. The game starts with Player 1's turn (typically represented by red discs).
3. Click on a column to drop your disc.
4. The game alternates turns between Player 1 and Player 2 (typically represented by yellow discs).
5. The first player to connect four discs in a row (horizontally, vertically, or diagonally) wins.

