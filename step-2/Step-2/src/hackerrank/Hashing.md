Hashing :- It is a technique to store the numbers with their frequency in easy manner


Simple Brute Force :- traverse through the array and find out how many times a particular number is 
coming in the array

arr[n] = {1,5,6,7,8,8,6,6,4,4,3,2,}
Query = [8,4,6,7];
int count = 0;
for(int j = 0; j<query.size(); j++){
  int n = Query[j];
  for(int i =0; i<arr.size(); i++){
  if(arr[i] == n){
  count++;
  }
   sout(count);
  }
}


Time Complexity = O(n*m)
n = size of arr
m = size of query


# Hashmap DataStructure :-  IT looks like an mapping array in which one side the element is there and another side its frequency is there
hashmap only takes O(N) space in the worst case
T.C -> O(1) 
printing hashmap takes O(1)


- whereas the hashing array takes O(MaxElement array space) in the 