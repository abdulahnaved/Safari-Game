# 🦁 Safari Game Simulation

A 2D top-down simulation game where players manage an African safari ecosystem, balancing wildlife, tourism, and economy. This game was developed collaboratively using **Agile practices** and **GitLab workflows** as part of a university semester project.

## 📜 Overview

In this real-time simulation, the player oversees an entire safari park. From managing animal populations and ecosystems to building infrastructure and serving tourists, the game presents a strategic and dynamic environment.

The game supports multiple difficulty levels and adjustable time speeds (hour/day/week), allowing for a flexible and engaging gameplay experience.

---

## 🎮 Core Gameplay Features

### 🐾 Animals
- Herbivores (e.g., zebras) feed on trees, bushes, and grass.
- Carnivores (e.g., lions) hunt herbivores.
- Animals roam the map, form groups, reproduce, and age.
- Animals react to hunger, thirst, and danger dynamically.

### 🌱 Plants & Water
- Various plant types can be purchased and placed.
- Water areas (e.g., ponds) provide essential hydration.
- Resources are required to keep animals alive and healthy.

### 🚙 Jeeps & Tourists
- Tourists rent jeeps to explore the safari.
- Jeeps follow player-built roads from entrance to exit.
- Tourists contribute to income based on satisfaction (animal sightings).

### 🛣️ Roads
- Players build roads to guide tourist jeeps across the safari.
- Vehicles automatically choose paths between key safari points.

### 💰 Economy & Market
- Players start with a limited capital.
- Earn money through animal trading and tourist visits.
- Buy plants, animals, roads, jeeps, and other items.
- Dynamic inventory and marketplace system.

---

## 🌟 Additional Features Implemented

- ✅ **Minimap**: Scrollable, zoomable overview of the entire map.
- ✅ **Rangers**: Rangers can protect animals, neutralize threats, and patrol the area.
- ✅ **Terrain Obstacles**: Hills and rivers affect visibility and animal movement.
- ✅ **Persistence**: Full game state saving and loading, including animal motion.
- ✅ **Custom Views**: Dynamic dashboards, market screens, inventory display, and more.

---

## 🧠 Technical Architecture

### 🔧 Technologies Used
- **Java** (Object-Oriented Design)
- **Java Swing** (for graphical interface)
- **GitLab CI/CD** (`.gitlab-ci.yml` for build/test pipelines)

### 🏗️ Design Patterns & Structure
- **MVC Architecture**: Clear separation of model, view, and controller logic.
- **OOP Principles**: Abstract classes for core game entities (e.g., `Animal`, `LandscapeObject`, `Player`).
- **Real-time Simulation**: Game logic tied to a controllable time system (`hour`, `day`, `week`).

### 📦 Project Modules
- `GameController.java` – Main simulation engine
- `SafariGameModel.java` – Game state and data structures
- `Animal`, `Plant`, `Road`, `WaterArea`, etc. – Game elements
- `MapView`, `GameView`, `MiniMapView`, etc. – Swing-based GUI components
- `PersistenceManager.java`, `GridSaver.java` – Save/load logic

---

## 🤝 Team Collaboration

- Developed collaboratively on **GitLab**.
- Managed tasks using **Agile methodology** with:
  - Weekly sprints
  - User stories and subtasks
  - Code reviews and merge requests
- Regular use of **Git**, **UML planning**, and **code modularization**.

---

## 🏁 Win & Loss Conditions

- **Win**: Sustain high capital, tourist numbers, and healthy animal populations for 3/6/12 months depending on difficulty.
- **Loss**: Bankruptcy or extinction of all animals.
