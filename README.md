# Long-living branches example
# Savostian V.V
# New feature_1

This repository demonstrates the Long-living branches strategy for managing branches in a Git-based project.

## Branch Structure

- `main` (or `master`): This is the main branch that contains the stable, production-ready code.
- `develop`: The long-living development branch where new features are integrated.
- `feature/*`: Short-lived feature branches used for developing new features or bug fixes. These branches are created from `develop`.
- `release/*`: Release branches created from `develop` when it's time to prepare for a new release.

## Workflow

1. **Create a feature branch**: When starting work on a new feature or bug fix, create a new branch from `develop`: `git checkout -b feature/new-feature develop`
2. **Commit changes**: Work on the new feature or bug fix, committing changes to the feature branch.
3. **Open a Pull Request**: Once the work is complete, push the feature branch to the remote repository and open a Pull Request from the feature branch into `develop`.
4. **Review and merge**: The Pull Request will be reviewed, and after addressing any feedback, it can be merged into the `develop` branch.
5. **Create a release branch**: When `develop` is ready for a new release, create a release branch from `develop`: `git checkout -b release/v1.2.0 develop`
6. **Prepare for release**: Perform any final testing, documentation updates, and release preparations on the release branch.
7. **Merge release into `main`**: Once the release is ready, merge the release branch into `main` and tag the release version.
8. **Merge back into `develop`**: Finally, merge the changes from the release branch back into `develop` to keep it up-to-date for future development.

By following this workflow, we maintain a clear separation between stable production code (`main`), active development (`develop`), and release preparation (`release/*` branches).
This strategy helps manage larger projects with longer release cycles and facilitates organized feature integration.
