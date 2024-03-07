for i in $(seq 5)
do
 echo $i
 if [ $i -eq 3 ]
 then
    break
 fi
done