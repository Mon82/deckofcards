# Deck of Cards Problem Statement

### What youâ€™ll need
* A favorite text editor or IDE
* JDK 1.8 or later
* [Maven 3+]
* Minimum knowledge about [spring boot](https://spring.io/projects/spring-boot)

### What you'll do
Your assignment is to code a set of classes that represent a deck of poker-style playing cards.
(Fifty-two playing cards in four suits: hearts, spades, clubs, diamonds, with face values of Ace,
2-10, Jack, Queen, and King.)
Within one of your classes, you must provide two operations:
1. shuffle() Shuffle returns no value, but results in the cards in the deck being randomly
permuted. Please do not use library-provided “shuffle” operations to implement this function.
You may use library provided random number generators in your solution if needed.
2. dealOneCard() This function should return one card from the deck to the caller. Specifically, a
call to shuffle followed by 52 calls to dealOneCard() should result in the caller being provided all
52 cards of the

#### Build the Project
```
./mvn clean install
```

#### Run the Project
```
./mvn spring-boot:run
```

#### Use the REST Service
```
curl http://localhost:8080/shuffle
curl http://localhost:8080/dealonecard
```

### Mandatory

### Important

