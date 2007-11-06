// ============================================================================
//
// Talend Community Edition
//
// Copyright (C) 2006-2007 Talend - www.talend.com
//
// This library is free software; you can redistribute it and/or
// modify it under the terms of the GNU Lesser General Public
// License as published by the Free Software Foundation; either
// version 2.1 of the License.
//
// This library is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
// Lesser General Public License for more details.
//
// You should have received a copy of the GNU General Public License
// along with this program; if not, write to the Free Software
// Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
//
// ============================================================================
package org.talend.designer.core.ui.editor.properties.controllers;

import org.talend.designer.core.ui.editor.properties.controllers.generator.IDynamicProperty;

/**
 * DOC ftang class global comment. Detailled comment <br/>
 * 
 * $Id: JavaMemoController.java 2007-1-9,下午06:04:09 ftang $
 * 
 */
public class JavaMemoController extends AbstractLanguageMemoController {

    public JavaMemoController(IDynamicProperty dp) {
        super(dp);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.designer.core.ui.editor.properties.controllers.AbstractLanguageMemoController#setLanguage()
     */
    protected void setLanguage() {
        this.setCurrentLanguage("java"); //$NON-NLS-1$
    }
}
