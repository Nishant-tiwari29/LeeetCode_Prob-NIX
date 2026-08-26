class Solution(object):
    def romanToInt(self, s):
        """
        :type s: str
        :rtype: int
        """
                # 1. Map symbols to their integer values
        roman_map = {
            'I': 1,
            'V': 5,
            'X': 10,
            'L': 50,
            'C': 100,
            'D': 500,
            'M': 1000
        }
        
        total = 0
        length = len(s)
        
        # 2. Loop through the string character by character
        for i in range(length):
            # If the current value is less than the next value, subtract it
            if i < length - 1 and roman_map[s[i]] < roman_map[s[i+1]]:
                total -= roman_map[s[i]]
            # Otherwise, add it to the total
            else:
                total += roman_map[s[i]]
                
        return total

        
