
# WESTERN GOVERNOR UNIVERSITY 
## D287 – JAVA FRAMEWORKS

### Part C:
```
In mainscreen.html...
Line 14 - Changed title to read "Pony Express"
Line 19 - Changed to read "Pony Express Inventory"
Line 21 - Changed to read "Tack"
Line 53 - Changed to read "Saddles"
```

### Part D:
```
Created about.html describing "Pony Express"
Created aboutController.java to render about.html
In mainscreen.html - Added lines 89-93 to navigate to "Pony Express" about page
```

### Part E:
```
In BootStrapData.java - Added code (lines 71-132) to load sample inventory for parts and products, 
only if the parts and products repositories are empty
```

### Part F:
```
In mainscreen.html - Added lines 85-86 to create a "Buy Now" button in the product section
Created buyproductconfirm.html to confirm product purchase
Created buyproducterror.html to display if no inventory is available
Created buyProductController.java with code to decrement inventory by one if inventory is available
and then render the confirm purchase page, or render error page if no inventory is available
```

### Part G:
```
In Part.java - Added line 7 to import maximum contraints validation
In Part.java - Added lines 33-36 to initialize minimum and maximum inventory variables
In part.java - Added lines 58-77 to create new Part constructor with minimum and maximum inventory fields
and to create a method to verify minimum and maximum inventory (forces inventory to stay within limits)
In Part.java - Added lines 111-125 to create getter and setter functions for minimum and maximum inventory
In BootStrapData.java - Added lines 96,97,103,104,110,111,117,118,124,125 to set the minimum and maximum inventory
In inhousePartServiceImpl.java - Added lines 53-54 to verify minimum and maximum inventory
In outsourcedPartServiceImpl.java - Added lines 51-52 to verify minimum and maximum inventory
In InhousePartForm.html - Added lines 24-26 to create minimum and maximum fields
In OutsourcedPartForm.html - Added lines 25-27 to create minimum and maximum fields
in mainscreen.html - Added lines 38-39 and 48-49 to display maximum and minimum inventory
Renamed spring-boot-h2-db102.mv.db to spring-boot-h2-db102.mv.db.old
```

### Part H:
```
In AddInHousePartController.java - Added lines 43-48 to display error messages if inventory is below minimum or above maximum
In AddOutsourcedPartController.java - Added lines 44-49 to display error messages if inventory is below minimum or above maximum
In Product.java - Added lines 4 and 22 to use the @ValidLowParts validator
In productForm.html - Uncommented "Back to Main Screen" Link for ease of use and testing
Created LowPartInvValidator.java to check for parts at or under minimum inventory when adding or updating product
Created ValidLowParts.java to display error message when parts are at or under minimum when adding or updating product
In mainscreen.html - Added lines 38-39 and 48-49 to display minimum and maximum inventory on the mainscreen. Added for ease of testing
```

### Part I:
```
In PartTest.java - Added lines 171-196 to test the setter and getter methods for minimum and maximum inventory
```

### Part J:
```
Deleted "DeletePartValidator.java" from validators to clean code as it is unused
```
