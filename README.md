# Hunger Bar Mod

This is a client-side Fabric mod for Minecraft 1.21.1 that changes the hunger bar color based on the last food item you ate.

Examples:
- cooked beef -> red hunger bar
- apples -> green hunger bar
- cooked cod -> blue hunger bar
- raw meat and uncooked food keep the default vanilla bar style

## Build

```bash
./gradlew build
```

The generated JAR will be in `build/libs`.

## Notes

This version is designed for client-side behavior only, which means it does not change any server-side game logic.
