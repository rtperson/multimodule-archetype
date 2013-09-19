#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
Buttons

* Gives you great looking CSS buttons, for both <a> and <button>.
* Demo: particletree.${packageInPathFormat}/features/rediscovering-the-button-element


Credits
----------------------------------------------------------------

* Created by Kevin Hale [particletree.${packageInPathFormat}]
* Adapted for Blueprint by Olav Bjorkoy [bjorkoy.${packageInPathFormat}]


Usage
----------------------------------------------------------------

1) Add this plugin to lib/settings.yml.
   See ${packageInPathFormat}press.rb for instructions.

2) Use the following HTML code to place the buttons on your site:

	<button type="submit" class="button positive">
	  <img src="css/blueprint/plugins/buttons/icons/tick.png" alt=""/> Save
	</button>

	<a class="button" href="/password/reset/">
	  <img src="css/blueprint/plugins/buttons/icons/key.png" alt=""/> Change Password
	</a>

	<a href="${symbol_pound}" class="button negative">
	  <img src="css/blueprint/plugins/buttons/icons/cross.png" alt=""/> Cancel
	</a>
