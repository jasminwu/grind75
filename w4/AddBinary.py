class Solution:
    def addBinary(self, a: str, b: str) -> str:
        result = ""
        carry = 0
    
        a = a.zfill(max(len(a), len(b)))
        b = b.zfill(max(len(a), len(b)))
    

        for i in range(len(a) - 1, -1, -1):
            bit_sum = int(a[i]) + int(b[i]) + carry
            result = str(bit_sum % 2) + result
            carry = bit_sum // 2
    

        if carry:
            result = "1" + result
        
        return result