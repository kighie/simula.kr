/* 
 * Copyright (c) 2012 IkChan Kwon kighie@gmail.com
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package kr.simula.formula.core.builder;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;

import kr.simula.formula.core.SourceLocation;


/**
 * <pre></pre>
 * @author kighie@gmail.com
 * @since 1.0
 */
public class FormulaSource {

    private String sourcePath;
    private String sourceString;
    
	/**
	 * @param sourcePath
	 * @param sourceString
	 */
	public FormulaSource(String sourcePath, String sourceString) {
		this.sourcePath = sourcePath;
		this.sourceString = sourceString;
	}

	/**
	 * @param sourceString
	 */
	public FormulaSource(String sourceString) {
		this(null, sourceString);
	}
    
	public void setSourcePath(String sourcePath) {
		this.sourcePath = sourcePath;
	}

	public void setSourceString(String sourceString) {
		this.sourceString = sourceString;
	}

	/**
	 * @return the sourceString
	 */
	public String getSourceString() {
		return sourceString;
	}
	
	public String getText(SourceLocation location){
		return sourceString.substring(location.getStartIndex(), location.getEndIndex());
	}
	/**
	 * @return the sourcePath
	 */
	public String getSourcePath() {
		return sourcePath;
	}
	

	public static FormulaSource newSource(String sourcePath, File file){
		FileReader reader = null;
		
		try {
			reader = new FileReader(file);
			return newSource(sourcePath, reader);
		} catch (FileNotFoundException e) {
			throw new BuildException("Cannot find Fomula source file [" + file + "]" , e);
		} finally {
			try {
				if(reader != null) { reader.close(); }
			} catch (IOException e) {
				// close silently.
			}
		}
		
	}

	public static FormulaSource newSource(String sourcePath, Reader reader){
		BufferedReader bfReader = new BufferedReader( reader );
		StringWriter writer = new StringWriter(1024);
		char[] cbuf = new char[1024];
		int length;
		
		try {
			while((length = bfReader.read(cbuf))>0){
				writer.write(cbuf, 0, length);
				writer.write('\n');
			}
		} catch (IOException e) {
			throw new BuildException("Load Fomula source stream [" + sourcePath + "]" , e);
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				// close silently.
			}
		}
		
		return new FormulaSource(sourcePath, writer.toString());
	}
	

	public static FormulaSource newSource(String sourcePath, InputStream stream, String encoding){
		InputStreamReader reader = null;
		
		try {
			reader = new InputStreamReader(stream, encoding);
			return newSource(sourcePath, reader);
		} catch (IOException e) {
			throw new BuildException("Cannot find Fomula source stream [" + sourcePath + "]" , e);
		} finally {
			try {
				if(stream != null) { stream.close(); }
			} catch (IOException e) {
				// close silently.
			}
		}
		
	}

	
}
