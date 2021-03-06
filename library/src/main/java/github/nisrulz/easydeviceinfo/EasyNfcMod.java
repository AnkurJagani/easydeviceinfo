/*
 * Copyright (C) 2016 Nishant Srivastava
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package github.nisrulz.easydeviceinfo;

import android.content.Context;
import android.nfc.NfcAdapter;

/**
 * The type Easy nfc mod.
 */
public class EasyNfcMod {

  private NfcAdapter nfcAdapter = null;

  /**
   * Instantiates a new Easy nfc mod.
   *
   * @param context the context
   */
  public EasyNfcMod(final Context context) {
    if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.GINGERBREAD_MR1) {
      nfcAdapter = NfcAdapter.getDefaultAdapter(context);
    }
  }

  /**
   * Is nfc present boolean.
   *
   * @return the boolean
   */
  public final boolean isNfcPresent() {
    return nfcAdapter != null;
  }

  /**
   * Is nfc enabled boolean.
   *
   * @return the boolean
   */
  public final boolean isNfcEnabled() {
    return nfcAdapter != null && nfcAdapter.isEnabled();
  }
}
