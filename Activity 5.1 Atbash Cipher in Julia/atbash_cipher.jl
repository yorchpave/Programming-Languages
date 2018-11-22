function cipher(input)
	plainText = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"
	atbashCipher = "zyxwvutsrqponmlkjihgfedcbaZYXWVUTSRQPONMLKJIHGFEDCBA"
	finalResult = ""
	resultSlot = 0
	foundLetter = 0
	
	# Cipher using English and Atbash
	for i = 1:endof(input)
		# This loop checks for any characters that match the atbash cipher
		for n = 1:endof(plainText)
			if (plainText[n] == input[i])
				finalResult = finalResult * string(atbashCipher[n])
				resultSlot = resultSlot + 1
				foundLetter = 1
			end
		end
		# If there are no matches in the atbash cipher 
		# Just add the character to the result
		if (foundLetter == 0)
			finalResult = finalResult * string(input[i])
			resultSlot = resultSlot + 1
		end
		foundLetter = 0
	end
	println("Text ciphered: ", finalResult, "\n")
end

cipher("jorge")
