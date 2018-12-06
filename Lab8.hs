module Lab8 where

import Data.Char
import Data.Maybe

--print statements
main = print (outfits)
main1 = print(length outfits)
main2 = print(length outfits2)
main3 = print(pairs)
main4 = print(b)

--part 1a and 2a

pants = ["jeans","khakis"]
tops = ["white shirt", "grey turtleneck", "pink polo", "green hoodie"]
shoes = ["brogues", "converse", "sandals"]
scarves = ["knit scarf", "paisley"]

outfits = [(x,y,z)|x<-pants, y<-tops, z<-shoes]

outfits2 = [(x,y,z,a)|x<-pants, y<-tops, z<-shoes,a<-scarves]

--When length outfits is called with instructions from part a, there are 24 possible outfits

--It makes more sense to buy the top and the pair of shoes because you get 40 outfits out of it,
--rather than 36 if you just bought the two tops

--Buying new pants and new shoes will yield the largest amount of 48 outfits

--With the scarves, there are 48 outfits

--part 1c

l = ["Mr.", "Ms.", "Mrs.", "Dr.", "Prof.", "Rev."]

couple = [(x++ " and " ++y)|x<-l,y<-l]
pairs = l++couple

--part 1d

list:: [(Char,String)]
list = [('A',"Alfa"), ('B',"Bravo"), ('C',"Charlie"), ('D',"Delta"), ('E',"Echo"), ('F',"Foxtrot"), ('G',"Golf"), ('H', "Hotel"), ('I', "India"), ('J', "Juliett"), ('K', "Kilo"), ('L', "Lima"), ('M', "Mike"), ('N', "November"), ('O', "Oscar"), ('P', "Papa"), ('Q', "Quebec"), ('R', "Romeo"), ('S', "Sierra"), ('T',"Tango"), ('U',"Uniform"), ('V',"Victor"), ('W',"Whiskey"), ('X',"X-ray"), ('Y',"Yankee"), ('Z',"Zulu")]

check = "DAY"

b = [snd a|y<-check, a<-list, y == fst a]

--part 2a

remainder :: Integer->Integer->Integer
remainder x y = x-(y*(div x y))

--part 2b

isEven:: Integer -> Bool
isEven even
    |mod even 2 == 0 = True
    |otherwise = False

--part 2c

merge [] a = a
merge (x:xs) a = x:merge a xs

--part 2d

removeMultiple::[Integer]->Integer->[Integer]
removeMultiple [] a = []
removeMultiple (x:xs) a
    |mod x a == 0 = removeMultiple xs a
    |otherwise = x:removeMultiple xs a

--part 3, this is the function for part 1a

numOutfits :: [String]->[String]->[String]->[(String, String, String)]
numoutfits [][][] = []
numOutfits (x:xs)(y:ys)(z:zs) = [(x, y, z)| x<-(x:xs), y<-(y:ys), z<-(z:zs)]

nato :: String -> String
nato = unwords. mapMaybe(flip lookup list.toUpper)

pair :: [String]->[String]
pair [] = []
pair (x:xs) = [(x++ " and " ++y)|x<-(x:xs),y<-(x:xs)]

pair2 ::[String]->[String]
pair2 xs = xs ++ pair xs