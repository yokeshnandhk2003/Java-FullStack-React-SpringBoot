import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import { faShoppingBasket, faTags } from "@fortawesome/free-solid-svg-icons";
const Header = () => {
  const navlinkclass="text-center-lg font-primary font-semibold text-primary py-2";
  return (
    <h1 className="border-b border-gray-300 sticky top-0 z-20 bg-gray-100">
      <div className="flex items-center justify-between mx-auto max-w-6xl px-6 py-4">
        <a
          href="/"
          className="text-center text-lg font-primary font-semibold text-primary"
        >
          <FontAwesomeIcon icon={faTags} className="fa-icon" />
          <span className="brand-title">Eazy Stickers</span>
        </a>

        <nav className="flex items-center py-2 z-10">
          <ul className="flex space-x-6">
            <li>
              <a
                href="/home"
                className={navlinkclass}
              >
                Home
              </a>
            </li>
            <li>
              <a
                href="/about"
                className={navlinkclass}
              >
                About
              </a>
            </li>
            <li>
              <a
                href="/contact"
                className={navlinkclass}
              >
                Contact
              </a>
            </li>
            <li>
              <a
                href="/login"
                className={navlinkclass}
              >
                Login
              </a>
            </li>
            <li>
              <a href="/cart" className="text-primary py-2">
                <FontAwesomeIcon icon={faShoppingBasket} />
              </a>
            </li>
          </ul>
        </nav>
      </div>
    </h1>
  );
};
export default Header;
