# Git Ignore Hands-On

## Objective

- Understand git ignore
- Learn how to ignore unwanted files and folders

## Explain Git Ignore

Git Ignore (.gitignore) is a file used to tell Git which files or folders should not be tracked or committed to the repository.

It helps keep the repository clean by avoiding unnecessary files like logs, temporary files, etc.

## Explain How to Ignore Unwanted Files

Create a .gitignore file
Add patterns of files/folders to ignore:
\*.log
log/
Git will now ignore all .log files and the log folder
Verify using:
git status

Ignored files will not appear in the status

## Tasks Performed

- Created a `.log` file
- Created a `log` folder
- Configured `.gitignore` to ignore:
  - \*.log files
  - log folder

## Commands Used

git init  
git status  
git add  
git commit  
git push

## Outcome

Successfully ignored unwanted files using `.gitignore`.

## Screenshots

Available in screenshots folder
