# Homework1_239040_Nilufer_Bashgul

# Telecom Service Package System

This project demonstrates a prototype-based design for creating and configuring telecom service packages.

## Overview

The system is designed to facilitate the creation of telecom service packages with different combinations of services. The Prototype Pattern is utilized to create new packages by cloning existing prototypes.

## Classes

### TelecomService

Base class representing a generic telecom service.

### VoiceService

Specialized class representing a voice service, inheriting from `TelecomService`.

### SmsService

Specialized class representing an SMS service, inheriting from `TelecomService`.

### DataService

Specialized class representing a data service, inheriting from `TelecomService`.

### RoamingService

Specialized class representing a roaming service, inheriting from `TelecomService`.

### ServicePackage

Class representing a package of telecom services. Utilizes the Prototype Pattern for easy cloning.

### PackageFactory

Factory class responsible for managing and cloning service package prototypes.

## Main

Example class demonstrating the usage of the classes in the system.

## Usage

1. Create instances of specialized services (`VoiceService`, `SmsService`, etc.).
2. Create a `ServicePackage` prototype and register it with the `PackageFactory`.
3. Use the `PackageFactory` to clone the prototype and create new service packages.
