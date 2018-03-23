T=input()
while T>0 :
	str=raw_input()
	g,v=raw_input().split()
	x=int(g)
	y=int(v)
	list2=[]
	l=len(str)
	list1=list(str)
	i=0
	j=0
	k=0
	#print l
	while i<l :
		if list1[i]=='a' :
			list2.insert(k,'a')
		#	print list2
			d=x
		#	print i
		#	print k
		#	print list1[i]
			j=k-1
			k=k+1
			count=0
			flag=-1
			while d>0 :
				if j<0 :
					break
				if list2[j]=='a' :
					count=count+1
				elif list2[j]!='a' :
					count=0
				j=j-1
				d=d-1
			if count==2 and d==0 :
				if 'b' in list1 :
						list2.insert(i,'b')
						k=k+1
						list1.remove('b')
						list1.append(' ')
					#	print list1
					#	print list2
				else :
					#print list1
					#print list2
					list2.insert(i,'*')
					#print list1
					#print list2
					list1.append(' ')
		elif list1[i]=='b' :
			list2.insert(k,'b')
			k=k+1
			d=y
			j=i-1
			while d>0 :
				if j<0 : 
					break
				if list1[j]=='b' :
					if 'a' in list1 :
						list2.insert(k,'a')
						k=k+1
						list1.remove('a')
						list1.append(' ')
				j=j-1
				d=d-1		
		i=i+1
	str = "".join(list1)
	print (str)
	T=T-1
