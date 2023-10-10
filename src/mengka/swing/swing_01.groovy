package mengka.swing

import groovy.swing.SwingBuilder
import java.awt.BorderLayout as BL
import java.awt.BorderLayout

/**
 *  SwingBuilder����groovy���ڳ���
 * 
 * @author mengka
 *
 */
class swing_01 {

	static main(args) {

		def  swing = new SwingBuilder()
		def count = 0

		/**
		 *  ���ƴ���
		 */
		def textlabel
		def frame=swing.frame(title:'test',size:[300, 300]){

			/**
			 *  ���ò���
			 */
			swing.borderLayout()

			textlabel=swing.label(text:"���${count}��",constraints:BL.NORTH)
			
			/**
			 *  ��ť����¼�
			 */
			button(text:"ȷ��",actionPerformed:{
				count++;
				textlabel.text="���${count}��";
				println "clicked ${count}"
				},constraints:BorderLayout.SOUTH)
		}
		
		frame.pack()
		frame.show()
	}
}
