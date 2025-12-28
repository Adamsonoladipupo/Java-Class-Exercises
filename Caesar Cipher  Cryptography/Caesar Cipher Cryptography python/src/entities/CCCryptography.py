
class CCCryptography(object):

    def char_to_int(self, char):
        if 'a' <= char <= 'z':
            return ord(char) - ord('a')
        if 'A' <= char <= 'Z':
            return ord(char) - ord('A')
        if char == ' ':
            return ord(' ')
        raise ValueError('Character is not valid')

    def int_to_char(self, num):
        if num == 32:
            return ' '
        return chr(num+97)

    def add_key(self, number, key):
        if number == 32:
            return ' '
        return number + key

    def minus_key(self, number, key):
        if number == 32:
            return ' '
        return number - key

    def modulo_26(self, number):
        if number == 32:
            return 32
        if number < 0:
            return number + 26
        if number >= 26:
            return number - 26
        return number

    def encrypt(self, text, key):
        encrypted_text = ""
        for char in text:
            number = self.char_to_int(char)
            new_added_key = self.add_key(number, key)
            modulo = self.modulo_26(new_added_key)
            new_char = self.int_to_char(modulo)
            encrypted_text += new_char
        return encrypted_text

    def decrypt(self, text, key):
        decrypted_text = ""
        for char in text:
            number = self.char_to_int(char)
            new_minus_key = self.minus_key(number, key)
            modulo = self.modulo_26(new_minus_key)
            new_char = self.int_to_char(modulo)
            decrypted_text += new_char
        return decrypted_text








