(ns aclm.core
  (:use seesaw.core))

(defn -main [& args]
  (invoke-later (-> (
    frame 
      :title "Aclm",
      :menubar (menubar :items [(
        menu 
	  :text "File"
	  :items [(
	    menu-item
	      :text "New"
	      :key "ctrl N") (
	    menu-item
	      :text "Open..."
	      :key "ctrl O") (
	    menu-item
	      :text "Save"
	      :key "ctrl S") (
	    menu-item
	      :text "Save As...") (
	    separator) (
	    menu-item
	      :text "Print Preview") (
	    menu-item
	      :text "Page-Setup...") (
	    menu-item
	      :text "Print..."
	      :key "ctrl P") (
	    separator) (
	    menu-item
	      :text "Send...") (
	    separator) (
	    menu-item
	      :text "Set As Wallpaper (Tiled)") (
	    menu-item
	      :text "Set As Wallpaper (Centered)") (
	    separator) (
	    menu-item
	      :text "∅") (
	    separator) (
	    menu-item
	      :text "Exit"
	      :key "alt F4")]) (
	menu
	  :text "Edit"
	  :items [(
	    menu-item
	      :text "Undo"
	      :key "ctrl Z") (
	    menu-item
	      :text "Repeat"
	      :key "F4") (
	    separator) (
	    menu-item
	      :text "Cut"
	      :key "ctrl X") (
	    menu-item
	      :text "Copy"
	      :key "ctrl C") (
	    menu-item
	      :text "Paste"
	      :key "ctrl V") (
	    menu-item
	      :text "Clear Selection") (
	    menu-item
	      :text "Select All"
	      :key "ctrl A") (
	    separator) (
	    menu-item
	      :text "Copy To...") (
	    menu-item
	      :text "Paste From...")]) (
	menu
	  :text "View"
	  :items [(
	    radio-menu-item
	      :text "Tool Box"
	      :key "ctrl T") (
	    radio-menu-item
	      :text "Color Box"
	      :key "ctrl L") (
	    radio-menu-item
	      :text "Status Bar") (
	    radio-menu-item
	      :text "Text Toolbar") (
	    separator) (
	    menu
	      :text "Zoom"
	      :items [(
	        menu-item
		  :text "Normal Size") (
		menu-item
		  :text "Large Size") (
		menu-item
		  :text "Custom...") (
		separator) (
		menu-item
		  :text "Show Grid"
		  :key "ctrl G") (
		menu-item
		  :text "Show Thumbnail")]) (
	    menu-item
	      :text "View Bitmap"
	      :key "ctrl F")]) (
        menu
	  :text "Image"
	  :items [(
	    menu-item
	      :text "Flip/Rotate..."
	      :key "ctrl R") (
	    menu-item
	      :text "Stretch/Skew..."
	      :key "ctrl W") (
	    menu-item
	      :text "Invert Colors"
	      :key "ctrl I") (
	    menu-item
	      :text "Attributes..."
	      :key "ctrl E") (
	    menu-item
	      :text "Clear Image"
	      :key "ctrl shift N") (
	    radio-menu-item
	      :text "Draw Opaque")]) (
	menu
	  :text "Color"
	  :items [(
	    menu-item
	      :text "Edit Colors...")]) (
	menu
	  :text "Help"
	  :items [(
	    menu-item
	      :text "Help Topics") (
	    menu-item
	      :text "About Paint")])])
      :content (
        canvas
          :size [400 :by 400]
          :background :white)
      :size [640 :by 480]
      :on-close :exit)
   show!)))
