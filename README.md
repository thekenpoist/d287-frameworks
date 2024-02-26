
# WESTERN GOVERNOR UNIVERSITY 
## D287 – JAVA FRAMEWORKS

### Part C:
```
On mainscreen.html...
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

