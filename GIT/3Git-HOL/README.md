# Git Branching and Merging Hands-On

## Objective

- Explain branching and merging
- Explain branch request in GitLab
- Explain merge request in GitLab

---

### 1: What is Branching in Git?

Branching in Git allows you to create a separate line of development. It helps developers work on new features without affecting the main branch.

---

### 2: What is Merging in Git?

Merging is the process of combining changes from one branch into another branch (usually into the main branch).

---

### 3: What is a Branch Request in GitLab?

A branch request is created when a developer pushes a new branch to the remote repository for collaboration or feature development.

---

### Q4: What is a Merge Request in GitLab?

**Answer:**  
A merge request is used to review and merge changes from one branch into another branch in GitLab.

---

## Hands-On Steps

### Branching

```bash
git branch GitNewBranch
git branch -a
git checkout GitNewBranch
echo This is branch work > branch.txt
git add .
git commit -m "Added file in GitNewBranch"
git status


Merging
git checkout main
git diff GitNewBranch
git merge GitNewBranch
git log --oneline --graph --decorate
git branch -d GitNewBranch
git status

Outcome
Created a new branch successfully
Added and committed changes in branch
Compared differences between branches
Merged branch into main
Deleted branch after merging



 Conclusion

This hands-on demonstrates how branching enables parallel development and merging integrates changes into the main branch.
```
