/*
 * =*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*
 * * The MIT License
 * * ---------------
 * * <p/>
 * * Copyright (c) 2009 University Corporation for Atmospheric Research and Massachusetts Institute of
 * * Technology Lincoln Laboratory
 * * <p/>
 * * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and
 * * associated documentation files (the "Software"), to deal in the Software without restriction,
 * * including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense,
 * * and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so,
 * * subject to the following conditions:
 * * <p/>
 * * The above copyright notice and this permission notice shall be included in all copies or substantial
 * * portions of the Software.
 * * <p/>
 * * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT
 * * NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
 * * IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE
 * * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 * =*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*
 */

package com.mijao.poc.jaxb;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.apache.commons.pool.BasePoolableObjectFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UnmarshallerPool extends BasePoolableObjectFactory {

    private static final Logger logger = LoggerFactory.getLogger(UnmarshallerPool.class);
    private JAXBContext context;

    public UnmarshallerPool(JAXBContext context) {
        this.context = context;
    }

    @Override
    public Object makeObject() throws Exception {
        logger.debug("Creating a new marshaller");
        Unmarshaller unmarshaller = context.createUnmarshaller();
        unmarshaller.setEventHandler(new ValidationChecker());
        return unmarshaller;
    }
}
