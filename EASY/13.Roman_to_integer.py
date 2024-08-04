# class Solution:
#     def romantoint(self,s:str)->int: 
    #the self parameter is used in instance methods within a class to refer to the instance of the class itself.
s=input("Enter the Roman:")
roman={"I":1,"V":5,"X":10,"L":50,"C":100,"D":500,"M":1000}
res=0

for i in range(len(s)):
    if i+1<len(s) and roman[s[i]]<roman[s[i+1]]:#CM-100<1000 then 1000-100 is taken here..
                res-=roman[s[i]]
    else:#LV-50<5 flase so 50+5
                res+=roman[s[i]]

print(f"Corresponding Integer is:{res}")
                