# spotless-ktlint-example

`spotless-maven-plugin` implementation example with `ktlint` for Kotlin project.

## Environments

- Kotlin 2.0.21
- Maven 3.9.9
- spotless-maven-plugin 2.43.0

## Usage

Add `spotless-maven-plugin` to `pom.xml` as follows.

```xml
<build>
    <sourceDirectory>src/main/kotlin</sourceDirectory>
    <testSourceDirectory>src/test/kotlin</testSourceDirectory>
    <plugins>
  
        <plugin>
            <groupId>com.diffplug.spotless</groupId>
            <artifactId>spotless-maven-plugin</artifactId>
            <configuration>
                <kotlin>
                    <includes>
                        <include>src/main/kotlin/**/*.kt</include>
                        <include>src/test/kotlin/**/*.kt</include>
                    </includes>
                    <ktlint />
                </kotlin>
            </configuration>
            <executions>
                <execution>
                    <id>spotless-clean</id>
                    <goals>
                        <goal>apply</goal>
                    </goals>
                    <phase>clean</phase>
                </execution>
                <execution>
                    <id>spotless-compile</id>
                    <goals>
                        <goal>check</goal>
                    </goals>
                    <phase>compile</phase>
                </execution>
            </executions>
        </plugin>
    </plugins>
</build>`
```

Apply format code when clean phase.

```shell
$ mvn clean
```

Check code style when compile phase.

```shell
$ mvn compile
```

## References

- [spotless/plugin-maven diffplug/spotless](https://github.com/diffplug/spotless/tree/3ddb27f7141fb51f349f38a269ae2e8918fe334d/plugin-maven)
- [Ktlint](https://pinterest.github.io/ktlint/latest/)
