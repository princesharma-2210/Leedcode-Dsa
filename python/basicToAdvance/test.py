#write, append
# str= "jai shree ram "
# f= open('text.txt','w')
# f.write(str)
# f.close()

f= open('text.txt','r')
e=f.readlines()
print(e)
f.close()