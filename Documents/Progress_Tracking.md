# Progress Tracking

## Purpose
This document outlines how progress tracking will work for the Destiny style companion app.

The goal is to help players track their personal progress without constantly checking the in-game UI or external spreadsheets.

This system focuses on clarity, simplicity, and manual tracking by the user.

---

## Scope & Constraints

- Progress tracking is manual and user-driven
- No real-time game API integration in initial version
- Focus is on usability, clarity, and low cognitive load
- Designed to support multiple games without deep game specific logic

## What Progress Tracking Includes

### 1. Quest Progress
Players can track multi-step quests such as:
- Exotic weapon quests
- Seasonal quest
- Story or activity-based quests

Each quest may include:
- Step name
- Current step number
- Notes (optional)

Example:
- Exotic Quest: Step 2 of 4
- Requirement: Complete Nightfall activities

---

### 2. Activity & Weekly Progress
Players can track progress for weekly activities such as:
- Dungeons
- Raids
- Nightfalls
- Seasonal activities

This helps players remember:
- What they have already completed
- What still needs to be done before weekly reset

---

### 3. Targeted Loot Tracking
Players can track items they are chasing, such as:
- Weapons
- Armor
- Catalysts

For each item, players can note:
- Source activity (ex: Dungeon, Raid)
- Difficulty required
- Current attempt status

Example:
- Weapon: Exotic Sword
- Source: Dungeon
- Status: Still farming

---

### 4. Progress Counters
For grind-based objectives, players can manually log numbers such as:
- Kill counts
- Completion counts
- Objective totals

Example:
- Objective: 75 kills
- Current Progress: 42 / 75

This avoids repeatedly checking the in-game menu.

---

## Design Notes
- Progress tracking is user-driven
- No direct modification of in-game data
- Focus is on usability and organization
- Designed to work alongside weekly resets

---

## Future Considerations
- Filtering progress by activity type
- Reset reminders for weekly content
- Optional visual indicators (checkmarks, progress bars)
