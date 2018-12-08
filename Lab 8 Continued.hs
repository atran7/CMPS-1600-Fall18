module Part2 where

--part 1

lastDigit::Integer->Integer
lastDigit x = mod x 10

dropLastDigit :: Integer -> Integer
dropLastDigit n
        | (abs n) < 10 = 0
        | otherwise = read $ init $ show n

--part 2

toRevDigits::Integer->[Integer]
toRevDigits 0 = []
toRevDigits n
    | n < 0 = []
    |otherwise = n `rem` 10 : toRevDigits (n `quot` 10)


--part 3

doubleEveryOther:: [Integer] -> [Integer]
doubleEveryOther [] = []
doubleEveryOther [x] = [2 * x]
doubleEveryOther (x:y:xs) = x:(2*y):(doubleEveryOther xs)

--part 4

sumDigits :: [Integer] -> Integer
sumDigits [] = 0
sumDigits (x:xs)
    |div x 10 == 1 = mod x 10 + div x 10 + sumDigits xs
    |otherwise = x + sumDigits xs

--part 5

luhn :: Integer -> Bool
luhn n
  | mod (sumDigits (doubleEveryOther (toRevDigits n)))  10 == 0 = True
  | otherwise  = False
