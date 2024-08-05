strs = ["flower", "flow", "flight"]  # or ["Dog", "Cat", "Cow"]
res = ""

for i in range(len(strs[0])):
    # Check each string in the list
    for s in strs:#check for each position in strs
        # If index i is out of bounds for the string s 'or' characters mismatches
        if i >= len(s) or s[i] != strs[0][i]:
            print(f"The prefix is: {res}")
            exit()
    res += strs[0][i]


print(f"The prefix is: {res}")

########## what i understood about the code ###########
#this code at first takes the first character of the first word
#and checks if that character is same for all the words in strs
#it continues until either the characters mismatch or string ends and prints the resultant prefix.