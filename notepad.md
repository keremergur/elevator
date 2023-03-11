
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

## Mistakes

- Thinking about multithreading before even implementing a move or call method
