/*
 * Copyright (c) 2009-2012 Clark & Parsia, LLC. <http://www.clarkparsia.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.clarkparsia.empire.sesame;

import java.io.File;

import com.clarkparsia.empire.ds.DataSourceFactory;

import com.clarkparsia.empire.EntityManagerTestSuite;
import com.clarkparsia.empire.util.TestUtil;
import org.junit.BeforeClass;

/**
 * <p>Extend the core Empire test suite to test the Sesame Repository implementation of a DataSource</p>
 *
 * @author  Michael Grove
 * @version 0.7.1
 * @since   0.7.1
 */
public class SesameEntityManagerTestSuite extends EntityManagerTestSuite {

    @BeforeClass
    public static void beforeClass() {
        System.setProperty("empire.configuration.file", new File(TestUtil.getProjectHome(), "core/test/test.empire.config.properties").getAbsolutePath());
	    EntityManagerTestSuite.beforeClass();
    }

	/**
	 * @inheritDoc
	 */
	@Override
	public DataSourceFactory createDataSourceFactory() {
		return new RepositoryDataSourceFactory();
	}
}
