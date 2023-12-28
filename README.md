# International Road Trip Planner

## Introduction
The International Road Trip Planner is a Java-based application utilizing
an object-oriented approach to calculate the shortest distance for traveling
between two countries, specifically from capital city to capital city. This
project leverages real-world data from [CIA World Factbook](https://www.cia.gov/the-world-factbook/field/land-boundaries/)
to gather information on borders, distances between capitals, state names/aliases,
and uses this information to create an undirected graph. The application implements
Dijkstra's algorithm to find the most efficient travel path.

## Getting Started

### Prerequisites
- Java Development Kit (JDK)
- An Integrated Development Environment (IDE) or a command line tool

### Installation and Running the Program
1. Clone the repository to your local machine.
```bash
$ git clone https://github.com/ccrawford4/International-Road-Trip-Planner.git
```
2. Open the project in your IDE or navigate to the project directory in your command line tool.
3. To compile the program, run:
```bash
$ javac Source/Classes/IRoadTrip
```
4. To run the program use:
```bash
$ java Source/Classes/IRoadTrip
```

## Usage
The application can be used to plan road trips between countries by calculating the shortest path from one capital city to another.

### Example Use:

#### Cross-continental route calculation
![multi-cont-1.png](./Images/multi-cont-1.png)

![mult-cont-2.png](Images%2Fmult-cont-2.png)

#### (Most) Country Aliases Are Considered
![alias.png](./Images/alias.png)

#### Case-Insensitive Searching
![case-insensitive.png](./Images/case-insensitive.png)

#### Error Handling
![invalid_route.png](./Images/invalid_route.png)

## Data Structures and Algorithms

### Data Structures
- **Undirected Weighted Graph with an Adjacency List**: The core structure of the project. It represents the network of countries and their capital cities, with edges weighted by the distance between them.
- **HashMaps**: Used for storing and quickly accessing the relationship between countries and their corresponding graph nodes.
- **PriorityQueues**: Integral in implementing Dijkstra's algorithm efficiently, used for selecting the next closest node to visit.
- **ArrayLists**: Utilized for dynamically storing lists of connected nodes in the graph structure.
- **LinkedLists**: Employed in various parts of the application for efficient insertion and deletion operations, which are essential in graph traversal and pathfinding.

### Algorithms
- **Dijkstra's Algorithm**: Implemented to calculate the shortest distance between two countries, taking into account the undirected and weighted nature of the graph. The algorithm uses a combination of the data structures mentioned above, particularly HashMaps and PriorityQueues, to efficiently determine the shortest path from the start country to any other country. The result is a HashMap where nodes represent the countries, and the values are the shortest distances from the starting country to each respective country.

This blend of data structures and algorithms ensures that the International Road Trip Planner not only provides accurate results but also does so with optimal efficiency and speed.

## Core Functions

### 1. User Input and Path Display `acceptUserInput()`
- Finds and displays the shortest path between the given countries, along with the route details.
- Informs the user if no route exists between the specified locations.
- Terminates the program if the user inputs indicate a desire to exit.

### 2. Pathfinding Between Two Countries `findPath(String country1, String country2)`
- A list of country names representing the shortest path, if such a path exists.
- An empty list, if no path is available or if the input countries are invalid.

### 3. Distance Calculation Between Two Countries `getDistance(String country1, String country2)`
- The distance between the countries if they are directly connected.
- `-1` if there is no direct connection between the countries or if either country name is not recognized.
- `0` if the two country names are identical.

## Testing
The project employs JUnit for testing.

1. Run tests using your IDE
2. Example Test:
```java
public class Test {
    @Test
    public void testOne() {
        int distance = roadTrip.getDistance("USA", "Mexico");
        int expectedDistance = 3024;
        Assert.assertEquals(expectedDistance, distance);
    }
}
```
3. Feel free to change or add any of the provided tests!
4. Use the `Assert.assertEquals(Object obj1, Object obj2)` function to ensure that the calculated value is what you expect it to be.

## Limitations
- The application has certain limitations in handling edge cases for specific country aliases and relationships.
As a result certain edge cases have been hard-coded to account for inconsistencies in the data files and to provide
a smooth user experience.
- Only accounts for travel via shared land borders

## Contact
For any queries or further information, feel free to contact [ccrawford6@dons.usfca.edu](mailto:ccrawford6@dons.usfca.edu).
