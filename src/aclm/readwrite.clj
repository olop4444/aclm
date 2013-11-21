(ns hello-seesaw.readwrite
(import java.io.FileOutputStream)
(import javax.imageio.ImageIO)
(import java.io.File)
(import java.awt.image.BufferedImage)
(:use mikera.image.core)
(:use mikera.image.colours))
;;https://github.com/mikera/imagez/tree/master

(defn save-image
	(^BufferedImage [^BufferedImage image ^String extension ^String file] 
		(ImageIO/write ^BufferedImage image extension (File. file))))

(defn -main []	 

;; create a new image
(def bi (new-image 50 50))

;; gets the pixels of the image, as an int array
(def pixels (get-pixels bi))

;; fill some random pixels with colours
(dotimes [i 2500]
  (aset pixels i (rand-colour)))

;; update the image with the newly changed pixel values
(set-pixels bi pixels)

;;another example
(def pic (load-image "asdf.bmp"))

(def ^byte pixels (get-pixels pic))

(dotimes [i 25000]
 (aset-byte pixels i 0x7f))
  
  (set-pixels pic pixels)

;; displays image in applet
(show pic :title "This is a test!")

;; saves image as file
(save-image pic "bmp" "asdf3.bmp")
)