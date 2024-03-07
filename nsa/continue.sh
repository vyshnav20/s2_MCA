for i in $(seq 5)
do
 
 if [ $i -eq 3 ]
 then
    continue
 else
 echo $i
 fi
done