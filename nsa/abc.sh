read -p "Enter a string: " s
i=2
a=`expr substr ${s} 1 $i`
echo $a