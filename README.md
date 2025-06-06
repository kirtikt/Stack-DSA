# 🧱 Java Stack-Based Expression Handling

This repository contains Java implementations showcasing how stacks can be used for expression parsing and evaluation. It covers core stack operations and their applications in mathematical expression processing.

## 📂 Files Included (Assumed from Context)

### 1. `CustomStack.java`
Implements a basic stack structure with essential operations:
- `push()`
- `pop()`
- `peek()`
- `isEmpty()`

Demonstrates how a stack can be created manually using arrays or linked lists.

---

### 2. `InfixToPostfix.java`
Converts an infix expression (e.g., `3 + 4 * 2`) to postfix notation (`3 4 2 * +`) using:
- Operator precedence
- Parentheses handling
- Stack for operators

---

### 3. `PostfixEvaluation.java`
Evaluates a postfix (Reverse Polish Notation) expression using a stack. Supports operators like `+`, `-`, `*`, `/`.

Example:
```text
Input: "5 6 2 + *"
Output: 40
