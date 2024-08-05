s = input("Enter the string: ")

stack = []

closing_paranthesis = {
    ")": "(",
    "]": "[",
    "}": "{"
}

for c in s:
    if c in closing_paranthesis:
        if stack and stack[-1] == closing_paranthesis[c]:
            stack.pop()
        else:
            print(False)
            break
    else:
        stack.append(c)
else:
    print(True if not stack else False)

####################### What I understood ######################
# Reads the input string from the user and stores it in the variable 's'
# Initializes an empty list called 'stack' which will be used to keep track of the parentheses
# Defines a dictionary called 'closing_paranthesis' that maps each closing parenthesis to its corresponding opening parenthesis
# Loops through each character 'c' in the input string 's'
# Checks if the current character 'c' is a closing parenthesis
# If the stack is not empty and the top of the stack (last element) matches the corresponding opening parenthesis
# Removes the top element from the stack (since it matched with 'c')
# If the stack is empty or the top of the stack does not match the corresponding opening parenthesis
# Prints 'False' indicating that the parentheses are not balanced
# Exits the loop early since the string is already determined to be unbalanced
# If the current character 'c' is not a closing parenthesis (i.e., it could be an opening parenthesis or other character)
# Adds the current character 'c' to the stack
# This 'else' block executes if the loop completes without encountering a 'break' statement
# Prints 'True' if the stack is empty (indicating all parentheses were balanced), otherwise prints 'False'
