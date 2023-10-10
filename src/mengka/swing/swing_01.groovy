package mengka.swing

import groovy.swing.SwingBuilder
import java.awt.BorderLayout as BL
import java.awt.BorderLayout

/**
 *  SwingBuilder构建groovy窗口程序
 * 
 * @author mengka
 *
 */
class swing_01 {

	static main(args) {

		def  swing = new SwingBuilder()
		def count = 0

		/**
		 *  绘制窗口
		 */
		def textlabel
		def frame=swing.frame(title:'test',size:[300, 300]){

			/**
			 *  设置布局
			 */
			swing.borderLayout()

			textlabel=swing.label(text:"点击${count}次",constraints:BL.NORTH)
			
			/**
			 *  按钮点击事件
			 */
			button(text:"确定",actionPerformed:{
				count++;
				textlabel.text="点击${count}次";
				println "clicked ${count}"
				},constraints:BorderLayout.SOUTH)
		}
		
		frame.pack()
		frame.show()
	}
}
