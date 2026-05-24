# Project Conventions & Actions Log

## Project Rules & Guidelines

When contributing to this project, adhere to the following rules:

1. **Package & Directory Structure**:
   - Follow standard Maven layout (`src/main/java`, `src/test/java`, `src/main/resources`).
   - Group related assessments by package (e.g., `assessment.java`, `assessment.sql`).
   - SQL solutions: `.sql` files in `src/main/resources/...`, with a Java entry point in `src/main/java/...` pointing to the SQL file.

2. **Test File Organization**:
   - **1:1 Mapping**: Each implementation file needs exactly one test file. Avoid monolithic test classes.

3. **Database Test Setup & Teardown**:
   - **No Hardcoded SQL**: Never use string literals for SQL setup/teardown in tests.
   - Use `javaz.util.FileManager` to load `.sql` scripts from `src/test/resources/...`.
   - Reference `assessment/sql/s/` directories for examples.

4. **Code Documentation (Javadoc)**:
   - Include full problem descriptions.
   - **Line Width**: Max **80 characters** strictly for Javadoc text (Java source code has no strict line limit; avoid awkward indentation).
   - **Character Set**: **ASCII characters only**.
   - **Formatting**: Clear indentation/alignment for tables, lists, and examples.

5. **Continuous Integration (GitHub Actions)**:
   - Use a matrix strategy to test packages independently in parallel.
   - Matrix entries must end with `*Test` to be detected by Maven Surefire (e.g., `"assessment.java.*Test"`).
   - Use `-DfailIfNoTests=false` to avoid failing the build on empty packages.

6. **Maven Configuration (`pom.xml`)**:
   - Keep minimal. Remove unused or commented-out dependencies/plugins.

7. **SQL Questions Migration Pattern**:
   - For folders containing SQL challenges (like `sql_questions/`), split them into 1:1 mapped subpackages (e.g., `assessment.sql.a`, `b`, `c`, etc.) grouped appropriately.
   - Place Main Java entry points in `src/main/java/assessment/sql/[group]/`.
   - Place Test Java files in `src/test/java/assessment/sql/[group]/`.
   - `.sql` solutions must be moved to `src/main/resources/assessment/sql/[group]/` with naming conventions like `[topic]_problem1.sql`.
   - SQL setup/reset scripts used for testing must be moved to `src/test/resources/assessment/sql/[group]/` with naming conventions like `[topic]_setup.sql` and `[topic]_reset.sql`.
   - Convert old `.md` instructional readmes directly into Javadocs within the main Java class.
   - When loading SQL files, use `javaz.util.FileManager.parseSqlFile("src/.../file.sql")`.
