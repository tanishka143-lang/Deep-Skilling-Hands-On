# 4Git-HOL - Merge Conflict Resolution

## Objectives

- Explain merge conflict
- Learn how to resolve merge conflicts in Git

---

### What is a merge conflict?

A merge conflict occurs when two branches modify the same file differently and Git cannot automatically merge them.

### How to resolve a merge conflict?

1. Open the conflicted file
2. Remove conflict markers (<<<<<<<, =======, >>>>>>>)
3. Keep the correct content
4. Stage and commit the file

---

## Steps Performed

### 1. Created branch

git checkout -b GitWork

### 2. Added file in branch

hello.xml → Branch Content

### 3. Switched to main

git checkout main

### 4. Added same file with different content

hello.xml → Main Content

### 5. Merged branch into main

git merge GitWork

### 6. Conflict occurred and resolved manually

---

## Proof of Work

### Git Log

git log --oneline --graph --decorate

### Git Status

git status

### Conflict File Example

<<<<<<< HEAD

# <h1>Main Content</h1>

<h1>Branch Content</h1>
>>>>>>> GitWork

Resolved to:

<h1>Main + Branch Content</h1>

---

## Outcome

- Successfully created merge conflict
- Resolved conflict manually
- Committed final merged code
