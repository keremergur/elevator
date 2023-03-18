
## Structure

- Simulator
- Building
    - FloorList
    - ElevatorList
    - ElevatorSystem 

## Realism

- Elevator movement speed
- Passenger entering
- Doors opening and closing
- Failsafes

## Function

- Move elevator to floor called
- Grab on the way if possible

## Possible issues

- Blackout:
    - may reset Elevator.currentFloor
    - will forget to finish if interrupted
- Enum direction is package scoped

## Mistakes

- Thinking about multithreading before even implementing a move or call method

## Extension

- Individual elevators
- Partial way elevators
    - Could use new system
        - Need to number floors differently
